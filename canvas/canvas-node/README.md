# CanvasDemo
Node JS App to showcase Salesforce Canvas Integration

[Blog Post](https://www.jitendrazaa.com/blog/salesforce/salesforce-integration-with-nodejs-based-applications-using-canvas/)


Set process.env.CANVAS_CONSUMER_SECRET in ./app.js (commented in code)

npm install
npm start

Run on EC2 -> Expose through ALB -> Configure Canvas App URL: https://<elb>

Setup -> Apps -> App Manager -> New Connected App 
	- Configure Canvas App URL: https://<elb>