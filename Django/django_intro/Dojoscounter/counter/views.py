from multiprocessing import context
from urllib import request
from django.shortcuts import render, redirect
import random


# Create your views here.

def rand(request):
    rand2 = random.randint(1, 100)
    request.session['rand'] = rand2
    return render(request,"index.html")


def show(request):
    request.session['namb'] = int(request.POST['num'])
    if request.session['namb']>request.session['rand']:
        request.session['result']="high"
    elif request.session['namb']<request.session['rand']:
        request.session['result']="low"
    elif request.session['namb']==request.session['rand']:
        request.session['result']="correct_number"
    else:
        return  redirect('/')   
    return redirect('/')

   
