/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.project_routing;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: project_routing._types.ProjectRoutingExpression

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#project_routing._types.ProjectRoutingExpression">API
 *      specification</a>
 */
@JsonpDeserializable
public class ProjectRoutingExpression implements JsonpSerializable {
	private final String expression;

	// ---------------------------------------------------------------------------------------------

	protected ProjectRoutingExpression(AbstractBuilder<?> builder) {

		this.expression = ApiTypeHelper.requireNonNull(builder.expression, this, "expression");

	}

	public static ProjectRoutingExpression projectRoutingExpressionOf(
			Function<Builder, ObjectBuilder<ProjectRoutingExpression>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code expression}
	 */
	public final String expression() {
		return this.expression;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("expression");
		generator.write(this.expression);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ProjectRoutingExpression}.
	 */

	public static class Builder extends ProjectRoutingExpression.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ProjectRoutingExpression> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ProjectRoutingExpression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProjectRoutingExpression build() {
			_checkSingleUse();

			return new ProjectRoutingExpression(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String expression;

		/**
		 * Required - API name: {@code expression}
		 */
		public final BuilderT expression(String value) {
			this.expression = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ProjectRoutingExpression}
	 */
	public static final JsonpDeserializer<ProjectRoutingExpression> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ProjectRoutingExpression::setupProjectRoutingExpressionDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupProjectRoutingExpressionDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::expression, JsonpDeserializer.stringDeserializer(), "expression");

	}

}
