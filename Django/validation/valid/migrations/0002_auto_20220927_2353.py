# Generated by Django 2.2.4 on 2022-09-27 20:53

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('valid', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='show',
            name='desc',
            field=models.CharField(default='NO Description for this movie', max_length=255),
        ),
    ]
