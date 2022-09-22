import email
from urllib import request
from django.shortcuts import render , redirect

from . models import User

# Create your views here.


def show(request):
    context={
        "all_the_users": User.objects.all()
    }
    return render(request,'index.html',context)


def result(request):
    
    User.objects.create( first_name=request.POST["firstname"],last_name=request.POST["lastname"],email=request.POST["email"],age=request.POST["age"])
    return redirect('/')


def result1(request):
    return render(request,'index.html')



 