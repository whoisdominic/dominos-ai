package ai.tokul.dominoes.ui.theme.components

import ai.tokul.dominoes.ui.theme.DominoesTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun CameraOverlay(navController: NavController) {
    Box(
    modifier = Modifier
    .fillMaxWidth()
    .fillMaxHeight()
    .padding(64.dp) // Padding to ensure it's above the system controls
    .windowInsetsPadding(WindowInsets.navigationBars), // Handles system insets like navigation bars
    contentAlignment = Alignment.BottomCenter // Align the button at the bottom center
    ) {
        Button(
            onClick = { navController.popBackStack() },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .width(60.dp) // Wider button
                .height(60.dp) // Set height of button
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close Camera",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CameraOverlayPreview() {
    DominoesTheme {
        val navController = rememberNavController()

        CameraOverlay(navController)
    }
}