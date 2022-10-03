from django.urls import path
from .import views

urlpatterns = [
    path('', views.welcome),
    path('message', views.messagee),
    path('comint', views.comint),
]