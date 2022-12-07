package com.tomaslab.test1.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.tomaslab.test1.R

data class Weapons(
    @StringRes val name:Int,
    @StringRes val inventor:Int,
    @DrawableRes val image:Int
    )


val weaponsList = listOf<Weapons>(
    Weapons(R.string.MG42,R.string.inventor, R.drawable.img_winner),
    Weapons(R.string.MP40,R.string.inventor, R.drawable.img_winner),
    Weapons(R.string.DT29,R.string.inventor, R.drawable.img_winner),
    Weapons(R.string.PPS43,R.string.inventor, R.drawable.img_winner),
    Weapons(R.string.PPSH41,R.string.inventor, R.drawable.img_winner),
    Weapons(R.string.SVT40,R.string.inventor, R.drawable.img_winner),
)