package FinancialSoftware;

public class FinancialSoftware {
    public static void main(String[] args) {
        //Case Study: Financial Software
        /* 
            Let's consider the problem of gathering info
            about a person's financial investments.
            We have Stocks, Dividend Stocks, Mutual Funds,
            Real estate, Cash...

            How would you design a complete portfolio system?
            What new types of objects would you write?

            Classes: Stocks, Dividend Stocks, Mutual Funds,
            Real estate, Cash and Portfolio

            Relations: DividendStocks is-a Stock (inheritance)

            A stock market, as stock is the market value is the 
            total number of shares that shareholders owns times 
            the current price per share.

            When working with stocks normally we talk about shares
            or owning a whole stock, for this example we will work
            with shares.

            On the other hand, cash's value is exactly it's amount.

            Another conclusion is that there are no common method
            calculations between stocks and cash.

            MutualFunds should have the same data as the stock object,
            but be able to hold partial shares.

            Because different assets compute their market values in 
            different ways: 
                We use interface: getMarketValue and getProfit
        */ 
    }
}
