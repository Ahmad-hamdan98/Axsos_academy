from django.urls import path ,include
from . import views

urlpatterns = [
    path('', views.times),
    path('time/', views.index),
]