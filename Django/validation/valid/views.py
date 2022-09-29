from django.shortcuts import render,redirect
from django.contrib import messages
from valid.models import*
# Create your views here.


def create(request):
     
    context={
        'all': Show.objects.all()
     }
    
    
    return render(request,"create.html",context)

def show(request,id):
    context={
        'last_objec':Show.objects.get(id=int(id)) 
    }
    return render(request,"readone.html",context)
def showone(request):
    errors = Show.objects.basic_validator(request.POST)
        
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
            return redirect('/create')
    else:
        Show.objects.create(title=request.POST['title'],show=request.POST['net'],date=request.POST['date'],desc=request.POST['desc'])

    return redirect("/show/"+str(Show.objects.get(title=request.POST['title']).id))

def readone(request,id):
    context={
        'last_objec':Show.objects.get(id=int(id))
    }
    return render(request,"readone.html",context)

def readall(request):
    context={
    'allshows':Show.objects.all()
    }
    return render(request,'readall.html',context)



def edit(request,id):
    context={
        'zeft':Show.objects.get(id=id)
    }
    return render(request,"update.html",context)


def editzeft(request,id):

    errors = Show.objects.basic_validator(request.POST)
        
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
            return redirect('/goedit/'+id)
    else:
        kara=Show.objects.get(id=id)
        kara.title =request.POST['title']
        kara.net =request.POST['net']
        kara.date =request.POST['date']
        kara.desc=request.POST['desc']
        kara.save()
    
    context={
        'last_objec':Show.objects.get(id=id)
                    }
    return render(request,"readone.html",context)



def delete(request,id):
    delw = Show.objects.get(id=int(id))
    delw.delete()
    return redirect("/")