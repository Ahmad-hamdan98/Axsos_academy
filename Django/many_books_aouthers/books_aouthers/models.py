from django.db import models

# Create your models here.


class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.CharField(max_length=255,default="NO Discription for this Book")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


class Aouther(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    note=models.TextField(max_length=255,default="no note for this Auther")
    books = models.ManyToManyField(Book, related_name="aouthers")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    

