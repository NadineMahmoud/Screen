package presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ass.screen.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun issueListScreen(
    displayBackButton: Boolean = true,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    "Issues", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color.DarkGray)
                )
            },
            navigationIcon = {
                if (displayBackButton) {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back Arrow", Modifier.size(40.dp), tint = Color.DarkGray
                        )
                    }
                }
            }
        )
        LazyColumn {
            items(count = 7) { index ->
                Card(
                    Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(horizontal = 10.dp, vertical = 14.dp)
                        .height(130.dp)
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 8.dp, top = 16.dp)
                                .fillMaxHeight(), verticalArrangement = Arrangement.Top
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.isuueiconn),
                                contentDescription = "Issue Icon",
                                Modifier.size(60.dp)
                            )

                        }
                        Column(
                            Modifier
                                .width(240.dp)
                                .height(130.dp)
                                .padding(top = 16.dp, start = 8.dp)
                        ) {
                            Text(
                                "Issue #$index: Detailed Information", Modifier.padding(bottom = 16.dp),
                                maxLines = 1, overflow = TextOverflow.Ellipsis, style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                            )

                            Text("No additional details", Modifier.padding(bottom = 20.dp), style = TextStyle(fontSize = 22.sp, color = Color.Gray))

                            Row {
                                Text("Created on: ", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp, color = Color.Black))
                                Text("2032-11-09, ", style = TextStyle(fontSize = 15.sp, color = Color.Black))
                                Text("13:05", style = TextStyle(fontSize = 15.sp, color = Color.Black))
                            }
                        }
                        Column(
                            Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(top = 22.dp, end = 10.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(
                                text = "Open", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 22.sp, color = Color.Green)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun issueListScreenPreview() {
    issueListScreen(displayBackButton = true)
}
