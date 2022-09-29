from email.policy import default
from enum import _auto_null
from turtle import title
from unittest.util import _MAX_LENGTH
from django.db import models






class BlogManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title']) < 5:
            errors["title"] = "Blog name should be at least 5 characters"
        if len(postData['desc']) < 10:
            errors["desc"] = "Blog description should be at least 10 characters"
        if len(postData['net']) < 8:
            errors["net"] = "Blog Nerwork should be at least 8 characters"    
        return errors

# Create your models here.


class Show(models.Model):
    title=models.CharField(max_length=255)
    show =models.CharField(max_length=255)
    date=models.DateTimeField(default=datetime.now)
    desc= models.CharField(max_length=255,default="NO Description for this movie")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = BlogManager()




