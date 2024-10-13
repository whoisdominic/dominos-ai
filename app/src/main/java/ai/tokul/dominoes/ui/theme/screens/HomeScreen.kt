package ai.tokul.dominoes.ui.theme.screens

import ai.tokul.dominoes.ui.theme.DominoesTheme
import ai.tokul.dominoes.ui.theme.components.FullScreenGradient
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun CustomButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF454545), // Light blue #
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp), // Rounded corners for buttons
        elevation = ButtonDefaults.buttonElevation(8.dp)
    ) {
        Text(
            text = text,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Title(copy: String, modifier: Modifier = Modifier) {
    Text(
        text = copy,
        style = MaterialTheme.typography.headlineLarge.copy(
            fontWeight = FontWeight.ExtraBold,
            color = Color.White,
            fontSize = 36.sp
        ),
        modifier = modifier
    )
}

@Composable
fun HomeScreen(navController: NavHostController) {
    FullScreenGradient {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Title("Dominoes")

            Spacer(modifier = Modifier.height(64.dp))

            // History Button
            CustomButton(
                text = "About",
                onClick = { /* Handle History action */ }
            )

            Spacer(modifier = Modifier.height(16.dp)) // Space between buttons

            // Start Counting Button
            CustomButton(
                text = "Start Counting",
                onClick = { navController.navigate("camera") }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DominoesTheme {
        val navController = rememberNavController()

        HomeScreen(navController)
    }
}