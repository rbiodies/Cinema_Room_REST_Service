# <img height="32" width="32" src="https://unpkg.com/simple-icons@v6/icons/postman.svg" /> Cinema_Room_REST_Service
### The objectives of this project:
1. Implement the /seats endpoint that handles GET requests and returns the information about the movie theatre.
2. Implement the /purchase endpoint that handles POST requests and marks a booked ticket as purchased.
3. Implement the /stats endpoint that will handle POST requests with URL parameters.
### Examples:
<details>
<summary>Example 1: a GET /seats request</summary>

![](https://user-images.githubusercontent.com/90090114/175533445-9ad0d78a-bd48-4a60-b252-5980df7dc7bd.png)
</details>
<details>
<summary>Example 2: a POST /stats request with no parameters</summary>

![](https://user-images.githubusercontent.com/90090114/175541436-5e8be16c-9cce-4c7e-a290-437577a266cc.png)
</details>
<details>
<summary>Example 3: a POST /stats request with the correct password</summary>

![](https://user-images.githubusercontent.com/90090114/175542014-f122d40f-b402-4865-9ffc-0958eed028c8.png)
>- current_income — shows the total income of sold tickets.
>- number_of_available_seats — shows how many seats are available.
>- number_of_purchased_tickets — shows how many tickets were purchased.
</details>
<details>
<summary>Example 4: a correct POST /purchase request</summary>

![](https://user-images.githubusercontent.com/90090114/175540937-1d80cfee-edc1-4af8-a201-7ed779fdee4a.png)
>- row — the row number;
>- column — the column number.
</details>
<details>
<summary>Example 5: a POST /purchase request, the ticket is already booked</summary>

![](https://user-images.githubusercontent.com/90090114/175541046-06873642-5947-4a0a-bc70-fb27fdc93602.png)
</details>
<details>
<summary>Example 6: a POST /purchase request, a wrong row number</summary>

![](https://user-images.githubusercontent.com/90090114/175541199-ffb85819-9f57-4827-88bd-1163e967b624.png)
</details>
<details>
<summary>Example 7: a correct POST /purchase request</summary>

![](https://user-images.githubusercontent.com/90090114/175541346-b19a12d6-def0-4be8-bca6-218824d9d257.png)
</details>
<details>
<summary>Example 8: a POST /stats request with the correct password</summary>

![](https://user-images.githubusercontent.com/90090114/175541579-57f6a835-252f-400f-b211-1909956a80aa.png)
</details>
<details>
<summary>Example 9: POST /return with the correct token</summary>

![](https://user-images.githubusercontent.com/90090114/175541661-9188dabb-7db1-4812-9e48-5f6246180c0f.png)
</details>
<details>
<summary>Example 10: POST /return with an expired token</summary>

![](https://user-images.githubusercontent.com/90090114/175541718-6c74e07f-a902-4b2e-bf71-7e5d00083bd4.png)
</details>
