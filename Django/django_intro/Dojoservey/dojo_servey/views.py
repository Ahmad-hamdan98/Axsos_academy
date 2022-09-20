from urllib import request
from django.shortcuts import render , redirect

# Create your views here.




def show(request):
    return render(request,'index.html')


def result(request):
    context={
        'name':request.POST["tetxname"],
        'location':request.POST["loc"],
        'favert':request.POST["fav"],
    }
    return render(request,'output.html',context)


def result1(request):
    return render(request,'output.html')



