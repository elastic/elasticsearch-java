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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: _types.mapping.PassthroughObjectProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.PassthroughObjectProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class PassthroughObjectProperty extends CorePropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Integer priority;

	@Nullable
	private final Boolean timeSeriesDimension;

	// ---------------------------------------------------------------------------------------------

	private PassthroughObjectProperty(Builder builder) {
		super(builder);

		this.enabled = builder.enabled;
		this.priority = builder.priority;
		this.timeSeriesDimension = builder.timeSeriesDimension;

	}

	public static PassthroughObjectProperty of(Function<Builder, ObjectBuilder<PassthroughObjectProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Passthrough;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public final Integer priority() {
		return this.priority;
	}

	/**
	 * API name: {@code time_series_dimension}
	 */
	@Nullable
	public final Boolean timeSeriesDimension() {
		return this.timeSeriesDimension;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "passthrough");
		super.serializeInternal(generator, mapper);
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PassthroughObjectProperty}.
	 */

	public static class Builder extends CorePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PassthroughObjectProperty> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Integer priority;

		@Nullable
		private Boolean timeSeriesDimension;

		public Builder() {
		}
		private Builder(PassthroughObjectProperty instance) {
			this.enabled = instance.enabled;
			this.priority = instance.priority;
			this.timeSeriesDimension = instance.timeSeriesDimension;

		}
		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Integer value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code time_series_dimension}
		 */
		public final Builder timeSeriesDimension(@Nullable Boolean value) {
			this.timeSeriesDimension = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PassthroughObjectProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PassthroughObjectProperty build() {
			_checkSingleUse();

			return new PassthroughObjectProperty(this);
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
	 * Json deserializer for {@link PassthroughObjectProperty}
	 */
	public static final JsonpDeserializer<PassthroughObjectProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PassthroughObjectProperty::setupPassthroughObjectPropertyDeserializer);

	protected static void setupPassthroughObjectPropertyDeserializer(
			ObjectDeserializer<PassthroughObjectProperty.Builder> op) {
		CorePropertyBase.setupCorePropertyBaseDeserializer(op);
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::priority, JsonpDeserializer.integerDeserializer(), "priority");
		op.add(Builder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");

		op.ignore("type");
	}

}
