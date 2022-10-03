from email import message
from django.shortcuts import redirect, render
from signin.models import*
# Create your views here.

def wall(request):
    

    return render(request,"posts.html")



# def Message(request):

#     user=User.objects.filter(email=request.session['user'])

#     Messages.objects.create(message=request.POST['message'])

#     return redirect("/")