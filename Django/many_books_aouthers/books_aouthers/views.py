# from turtle import title

from django.shortcuts import render ,redirect

from books_aouthers.models import Aouther, Book 

# Create your views here.


def main(request):
    context={

        'allthebooks':Book.objects.all(),
        
    }
    return render(request,'index.html',context)


def book(request):
    Book.objects.create(title=request.POST['title'],desc=request.POST['desc'])
    return redirect('/')




def notmain(request):
    context={

        'alltheaouthers':Aouther.objects.all(),
    }
    return render(request,'outviews.html',context)

def aouther(request):
    Aouther.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],note=request.POST['note'])
    return redirect("/aouther")


def views1(request,id):
    showbook=Book.objects.get(id=id)
    
    context = {
    	"showbook":Book.objects.get(id=id), 
        "allbooks":showbook.aouthers.all(),
        "author" :Aouther.objects.all()
    }  
    return render(request,"view1.html",context)
    

def createauth(request):
    showbook=Book.objects.get(id=request.POST['ids'])
    showauthor=Aouther.objects.get(id=request.POST['select'])

    showbook.aouthers.add(showauthor)
    #showauthor.books.add(showbook)
    return redirect("/")


def views2(request,id):
    showauth=Aouther.objects.get(id=id)
    # Auu=showauth.books.all()
    context = {
    	"showauther":Aouther.objects.get(id=id), 
        "allauthor":Aouther.objects.all(),
        "book" :Book.objects.all(),
        "auu":showauth.books.all(),
    }   
    return render(request,"view2.html",context)

def createbook(request):
    showauthor=Aouther.objects.get(id=request.POST['idss'])
    showbook=Book.objects.get(id=request.POST['select'])

    showbook.aouthers.add(showauthor)
    # showauthor.books.add(showbook)
    return redirect("/aouther" )