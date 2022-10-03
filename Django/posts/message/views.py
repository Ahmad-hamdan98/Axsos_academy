import email

import bcrypt

from django.shortcuts import redirect, render
from django.contrib import messages

from .models import*
# Create your views here.


def main(request):
    context={
    "all":User.objects.all()
    }
    return render(request,"login.html",context)



def regist(request):

    errors = User.objects.basic_validator(request.POST)

    for key, value in errors.items():
        messages.error(request, value)
        return redirect('/')
    else:
        first_name=request.POST['firstname']
        last_name =request.POST['lastname']
        email=request.POST['email']
        password=request.POST['pass']
        pw_hash=bcrypt.hashpw(password.encode(),bcrypt.gensalt()).decode()
        confirm_PW=request.POST['confirm']

        User.objects.create(first_name=first_name,last_name=last_name,email=email,password=pw_hash,confirm_PW=confirm_PW)
        user1=User.objects.last()
        request.session['email']=request.POST['email']
        request.session['pass']=pw_hash
        request.session['userid']=user1.id

        return redirect("/success")


def success(request):
    if 'userid' in request.session:
        context={
            'name1':User.objects.last()
        }
        return render(request,"result.html",context)
    else:
        return redirect('/')


def login(request):
    user=User.objects.filter(email=request.POST['email1'])
    if user :
        logged_user=user[0]
        # request.session['user']=User.objects.filter(email=request.POST['email1'])
        # to get user by email ...
        if bcrypt.checkpw(request.POST['pass1'].encode(),logged_user.password.encode()):
            request.session['userid']=logged_user.id
            return redirect("/wall")
        else:
            
            return render(request,"massege.html")
    
    return render(request,"massege.html")

def logout (request):
    del request.session['userid']

    return redirect('/')


