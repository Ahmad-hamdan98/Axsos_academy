from django.shortcuts import render,redirect

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
    kara=Show.objects.get(id=id)
    kara.title =request.POST['title1']
    kara.net =request.POST['net1']
    kara.date =request.POST['date1']
    kara.desc=request.POST['desc1']
    kara.save()
    context={
        'last_objec':Show.objects.get(id=id)
    }
    return render(request,"readone.html",context)



def delete(request,id):
    delw = Show.objects.get(id=int(id))
    delw.delete()
    return redirect("/")