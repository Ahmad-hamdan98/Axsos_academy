from django.shortcuts import render,redirect,request

# Create your views here.
def result(request):
    
    return render (request,'index.html')