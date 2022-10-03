from django.shortcuts import render
from time import gmtime, strftime


# Create your views here.
def times(request):
    return render(request,'index.html')


    
def index(request):
    context = {
        "time": strftime("%b-%d ,%Y", gmtime()),
        "time2":strftime("%H:%M %p", gmtime())
    
    }
    return render(request,'index.html', context)

