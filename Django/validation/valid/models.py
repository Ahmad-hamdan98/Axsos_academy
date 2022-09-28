from email.policy import default
from enum import _auto_null
from turtle import title
from unittest.util import _MAX_LENGTH
from django.db import models



# Create your models here.
class Show(models.Model):
    title=models.CharField(max_length=255)
    show =models.CharField(max_length=255)
    date=models.DateTimeField()
    desc= models.CharField(max_length=255,default="NO Description for this movie")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


