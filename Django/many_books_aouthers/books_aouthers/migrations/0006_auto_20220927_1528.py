# Generated by Django 2.2.4 on 2022-09-27 12:28

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('books_aouthers', '0005_auto_20220927_1521'),
    ]

    operations = [
        migrations.AlterField(
            model_name='book',
            name='desc',
            field=models.CharField(default='NO Discription for this Book', max_length=255),
        ),
    ]
