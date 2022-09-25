from django.db import models

# Create your models here.


class Dojo(models.Model):
    name= models.CharField(max_length=45)
    city=models.CharField(max_length=45)
    state=models.CharField(max_length=45)

class Ninja(models.Model):
    firstname=models.CharField(max_length=45)
    lastname=models.CharField(max_length=45)
    # dojo=models.Choices(value=dojo)
    dojo=models.ForeignKey(Dojo,related_name="ninjas", on_delete = models.CASCADE)



