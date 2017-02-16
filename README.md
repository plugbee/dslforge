# DSL Forge

DSL Forge is a framework for the development of domain-specific language (DSL) editors for web applications and cloud IDEs. 
It allows to get web-based textual editors automatically from ANTLR grammars. From the language grammar specification, JavaScript parser and lexer are automatically generated and embedded into Cloud9’s ACE editor.

Check out the [live demo!](http://beeone.dslforge.org/workbench)

The framework is composed of two features:
- **Tooling** for language development, and
- **Runtime**, or Target Components.

## Tooling
The Tooling has two code generators which take language grammars expressed with Xtext or ANTLR and generate two variants of editors. 

<a href="url"><img src="http://dslforge.org/wp-content/uploads/2016/01/dslforge-tooling-xtext-generator.png" align="middle" width="500" ></a>

- _**Generate Web Editor from ANTLR**_ produces a text editor with JavaScript parser and lexer from ANTLR v3. You get an ACE editor tailored for the language definition which runs fully on the client side. This editor has no backend, use it for integration with JavaScript servers.
- _**Generate Web Editor from Xtext**_ produces a plugin to be packaged with the original Xtext plugin into a workbench application enabling precise interaction between the client and the server.

## Runtime
The Runtime is required if you develop against the Eclipse Remote Application Platform (RAP). It is a set of plugins providing services such as typed content assist, workspace management, persistency, etc. The plugins are built on top of the Basic Equinox RAP Target you can already download from the Eclipse RAP update sites.

# Editor Features
Below the complete list of features bound by default in the generated editors:
- Syntax highlighting,
- Syntax validation,
- Content assist,
- Sever-side semantic validation,
- Scoping,
- Template proposals,
- Text hovering,
- Default Key bindings,
- Undo/Redo Support,
- Code Folding, 
- Brace Matching.

## Installation

1. **Install Eclipse**
The current DSL Forge version is based on Eclipse Neon [packages](http://www.eclipse.org/downloads/packages/).
To know which package is the most appropriate for you, select one of the following alternatives.
 - **Eclipse IDE for Java EE Developers**
In this scenario, users are interested in having a DSL editor shipped with HTML/JavaScript applications. The generator outputs a static web project ready to be debugged under Eclipse. The most appropriate distribution to use is Eclipse IDE for Java EE Developers as it comes with a simple HTTP Preview server easy to configure.
 - **Eclipse for RCP and RAP Developers**
If you want a closer integration with Xtext and EMF, or if you want to integrate the editor with other Eclipse components, you’d better install Eclipse for RCP and RAP Developers. This makes it possible to integrate the editor with third party RWT (Remote Widget Toolkit, the web-based SWT) plugins and widgets.

2. **Install the Xtext SDK**
Install Xtext Complete SDK from Neon [update site](http://download.eclipse.org/releases/neon) (Help>Install New Software).

3. **Install DSL Forge Tools**
Use the regular [update site](http://dslforge.org/downloads/tooling/repository/).

## Usage

Two use cases are documented on the official website:
- [Generate Web Editor from ANTLR](http://dslforge.org/getting-started-generate-ace-editor/)
- [Generate Web Editor from Xtext](http://dslforge.org/getting-started-generate-xtext-rap-editor/)

### Generate Web Editor from Xtext
- Step 1 - [Generate Web Editor from Xtext](https://youtu.be/vDGwmz4lU54)
- Step 2 - [Set up Debug Configuration and Test Editor](https://youtu.be/aD-DsFIwo3I)
- Step 3 - [Build Web Application Archive](https://youtu.be/FOnoayKri7E)
- Step 4 - [Deploy Web Archive on Servlet Container](https://youtu.be/2u5agv8koAo)

### Generate Web Editor from ANTLR
See [tutorial](http://dslforge.org/getting-started-generate-ace-editor/)

## Documentation

Additional usage informationn can be found [here](http://dslforge.org/documentation-2/)

If you still need help, please open an [issue](https://github.com/plugbee/dslforge/issues/new), or drop an email to team@dslforge.org for professional support.

## Contributing

We actively encourage and support contributions! DSL Forge is open source, feel free to fork the repository and enhance the tool the way you want. 

## License

DSL Forge program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which is available at http://www.eclipse.org/legal/epl-v10.html
