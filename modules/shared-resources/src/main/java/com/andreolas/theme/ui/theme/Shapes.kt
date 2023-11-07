package com.andreolas.theme.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

data class Shapes(
  val roundedSmall: RoundedCornerShape = RoundedCornerShape(2.dp),
  val roundedMedium: RoundedCornerShape = RoundedCornerShape(4.dp),
  val roundedLarge: RoundedCornerShape = RoundedCornerShape(8.dp),
  val roundedTopMedium: RoundedCornerShape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
  val roundedTopLarge: RoundedCornerShape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
)

internal val LocalShapes = staticCompositionLocalOf { Shapes() }
