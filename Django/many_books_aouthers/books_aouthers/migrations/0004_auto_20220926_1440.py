# Generated by Django 2.2.4 on 2022-09-26 11:40

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('books_aouthers', '0003_aouther_note'),
    ]

    operations = [
        migrations.AlterField(
            model_name='aouther',
            name='note',
            field=models.TextField(max_length=255, null=True),
        ),
    ]
