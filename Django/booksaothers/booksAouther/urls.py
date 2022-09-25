from django.urls import path 
from . import views
urlpatterns = [
    path('', views.start),
    path('dojo',views.dojo),
    path('ninja',views.ninja),
    path('delete',views.delete),
        path('deleteninja',views.deleteninja)

]