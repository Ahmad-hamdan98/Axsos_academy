from django.urls import path ,include
from .import views
urlpatterns = [
    path('',views.main),
    path('regist',views.regist),
    path('login',views.login),
    path('success',views.success),
    path('logout/<id>',views.logout),

]
