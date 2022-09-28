from django.urls import path,include

from .import views

urlpatterns = [
    path('create' , views.create),
    path('showone',views.showone),
    path('show/<id>',views.readone),
    path('showss/<id>',views.editzeft),
    path('delet/<id>',views.delete),

    path('goshow/<id>',views.show),
    path('goedit/<id>',views.edit),
    path('',views.readall)
]
