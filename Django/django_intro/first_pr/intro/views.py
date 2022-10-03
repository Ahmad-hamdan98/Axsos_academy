
from django.shortcuts import render ,HttpResponse ,redirect

# Create your views here.
def method1(request):

    return HttpResponse("al zeft zabat")



def root(request):

   return redirect ('/blogs')


def blog(request):
    return HttpResponse("fdvcwersfxcvcewdsc")

def create(request):
    return redirect('/')

def nums(request, id ):
    return HttpResponse(f'sadzvfxgdbnhfjmhnfgbdfvsc{id}')

def destroy(request, id ):
    return redirect ('/blogs')