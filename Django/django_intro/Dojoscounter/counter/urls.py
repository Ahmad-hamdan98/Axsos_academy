from django.urls import path
from . import views


urlpatterns = [
     path('',views.rand),
     path('show',views.show),
    

]
