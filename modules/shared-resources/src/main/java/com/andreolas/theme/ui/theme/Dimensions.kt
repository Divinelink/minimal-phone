@file:Suppress("PropertyName", "ConstructorParameterNaming")

package com.andreolas.theme.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
  val keyline_0: Dp = 0.dp,
  val keyline_1: Dp = 1.dp,
  val keyline_2: Dp = 2.dp,
  val keyline_4: Dp = 4.dp,
  val keyline_6: Dp = 6.dp,
  val keyline_8: Dp = 8.dp,
  val keyline_10: Dp = 10.dp,
  val keyline_12: Dp = 12.dp,
  val keyline_13: Dp = 13.dp,
  val keyline_14: Dp = 14.dp,
  val keyline_16: Dp = 16.dp,
  val keyline_17: Dp = 17.dp,
  val keyline_20: Dp = 20.dp,
  val keyline_24: Dp = 24.dp,
  val keyline_26: Dp = 26.dp,
  val keyline_28: Dp = 28.dp,
  val keyline_32: Dp = 32.dp,
  val keyline_36: Dp = 36.dp,
  val keyline_40: Dp = 40.dp,
  val keyline_48: Dp = 48.dp,
  val keyline_56: Dp = 56.dp,
  val keyline_58: Dp = 58.dp,
  val keyline_64: Dp = 64.dp,
  val keyline_72: Dp = 72.dp,
  val keyline_96: Dp = 96.dp,
)

internal val LocalDimensions = staticCompositionLocalOf { Dimensions() }
