package Dto;
import lombok.Data;
import java.sql.Timestamp;

@Data
public class Transaction {
    /*
    {'transactionId': '03adcc9c-c949-4bbb-ad03-280fbbe2794f',
    'productId': 'product3', 'productName': 'laptop', 'productCategory': 'grocery',
    'productPrice': 314.37, 'productQuantity': 6, 'productBrand': 'mi',
    'currency': 'GBP', 'customerId': 'vmoran',
    'transactionDate': '2025-04-23T03:59:17.992240',
    'paymentMethod': 'debit_card', 'totalAmount': 1886.22}
     */

    private String transactionId;
    private String productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    private int productQuantity;
    private String productBrand;
    private double totalAmount;
    private String currency;
    private String customerId;
    private Timestamp transactionDate;
    private String paymentMethod;
}
