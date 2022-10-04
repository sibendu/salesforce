
# Embedding a React app in Salesforce Site Pages, or Lightning Page

1>
npm install 
npm start
npm run build

2>
Zip contents of build folder, and upload in Salesforce as static resource - name 'lightningcontainerboilerplate'

3> 
Create a Lightning component (Aura) named 'lightningcontainerboilerplate' using code in .\apex\src\aura\lightningcontainerboilerplate

4>
Create a Lightning App named 'lightningcontainerboilerplateapp' using code in .\apex\src\aura\lightningcontainerboilerplateapp

Now there are two ways -

1. Create a page using Lightning App Builder -> This can be opened from Salesforce platform using Launchpad

2. For the compnet to be usable in Site Page through Builder , create the Lightning component 'lightningcontainerboilerplate' in step 3 above as below - 
<aura:component implements="forceCommunity:availableForAllPageTypes" access="global" >
 
Then it will be available in componet pallette and dragged-dropped on the page
