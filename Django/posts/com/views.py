

from email import message
from django.shortcuts import redirect, render
from message.models import*
# Create your views here.

def welcome(request):
    
    context={
        'allmessages': Messages.objects.all(),
        'allcomints':Coments.objects.all(),
        'u': User.objects.filter(id=request.session['userid'])
    }

    return render(request,"posts.html",context)



def messagee(request):

    user=User.objects.get(id=request.session['userid'])
  
    Messages.objects.create(Messagee=request.POST['post'],user=user)

    return redirect("/wall")

def comint(request):
    user=User.objects.get(id=request.session['userid'])
    mess=Messages.objects.get(id=request.POST['hide'])
    Coments.objects.create(coment=request.POST['com'],user=user,message=mess)
    return redirect("/wall")