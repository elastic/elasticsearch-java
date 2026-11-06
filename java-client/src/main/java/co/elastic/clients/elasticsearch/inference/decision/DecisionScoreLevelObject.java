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

package co.elastic.clients.elasticsearch.inference.decision;

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

// typedef: inference.decision.DecisionScoreLevelObject

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.DecisionScoreLevelObject">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionScoreLevelObject implements JsonpSerializable {
	private final String label;

	@Nullable
	private final String description;

	// ---------------------------------------------------------------------------------------------

	private DecisionScoreLevelObject(Builder builder) {

		this.label = ApiTypeHelper.requireNonNull(builder.label, this, "label");
		this.description = builder.description;

	}

	public static DecisionScoreLevelObject of(Function<Builder, ObjectBuilder<DecisionScoreLevelObject>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The label of the level.
	 * <p>
	 * API name: {@code label}
	 */
	public final String label() {
		return this.label;
	}

	/**
	 * A description of the level.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
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

		generator.writeKey("label");
		generator.write(this.label);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DecisionScoreLevelObject}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DecisionScoreLevelObject> {
		private String label;

		@Nullable
		private String description;

		public Builder() {
		}
		private Builder(DecisionScoreLevelObject instance) {
			this.label = instance.label;
			this.description = instance.description;

		}
		/**
		 * Required - The label of the level.
		 * <p>
		 * API name: {@code label}
		 */
		public final Builder label(String value) {
			this.label = value;
			return this;
		}

		/**
		 * A description of the level.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DecisionScoreLevelObject}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecisionScoreLevelObject build() {
			_checkSingleUse();

			return new DecisionScoreLevelObject(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DecisionScoreLevelObject}
	 */
	public static final JsonpDeserializer<DecisionScoreLevelObject> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DecisionScoreLevelObject::setupDecisionScoreLevelObjectDeserializer);

	protected static void setupDecisionScoreLevelObjectDeserializer(
			ObjectDeserializer<DecisionScoreLevelObject.Builder> op) {

		op.add(Builder::label, JsonpDeserializer.stringDeserializer(), "label");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");

	}

}
