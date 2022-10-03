from django.urls import path
from . import views
urlpatterns = [
    path('', views.method1 ),
    path('root/', views.root ),
    path('blogs/', views.blog ),
    path('blogs/create/', views.create ),
    path('blogs/<int:id>/edit/', views.nums ),
    path('blogs/<int:id>/delet/', views.destroy ),
]
