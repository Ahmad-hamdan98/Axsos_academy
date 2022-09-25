
from django.shortcuts import render ,redirect

# Create your views here.
from booksAouther.models import *


def start(request):

    context={
         'alldojo':Dojo.objects.all(),
         'allninja':Ninja.objects.all(),
     }
    return render(request,'index.html',context)



def dojo(request):

    Dojo.objects.create(name=request.POST['name'],city=request.POST['city'],state=request.POST['state'])

    return redirect('/')


def ninja(request):
    dojos=Dojo.objects.get(id=int(request.POST["dojo"]))
    Ninja.objects.create(firstname=request.POST['firstname'],lastname=request.POST['lastname'],dojo=dojos)
    return redirect('/')

def delete(request):
    dojos=Dojo.objects.get(id=request.POST["delete"])
    dojos.delete()
    return redirect('/')

def deleteninja(request):
    ninjas=Ninja.objects.get(id=request.POST["delete"])
    ninjas.delete()
    return redirect('/')