package ua.wwind.table.format.data

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
public data class FormatDialogSettings(
    val copiedItemHighlightDuration: Long = 3000,
    val copiedItemHighlightColor: Color = Color.Unspecified,
)
