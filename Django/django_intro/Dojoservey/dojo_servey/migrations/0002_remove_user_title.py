# Generated by Django 2.2.4 on 2022-09-22 10:35

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('dojo_servey', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='user',
            name='title',
        ),
    ]
