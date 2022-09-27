from django.urls import path,include
from . import views
urlpatterns = [
    path('',views.main ),
    path('book',views.book),
    path('auth',views.aouther),

    path('aouther',views.notmain),
    path('views/<id>',views.views1),
    path('views2/<id>',views.views2),

    path('addauth',views.createauth),
    path('addbook',views.createbook)
]
