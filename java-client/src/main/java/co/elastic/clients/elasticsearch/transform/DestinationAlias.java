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

package co.elastic.clients.elasticsearch.transform;

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
import java.lang.Boolean;
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

// typedef: transform._types.DestinationAlias

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform._types.DestinationAlias">API
 *      specification</a>
 */
@JsonpDeserializable
public class DestinationAlias implements JsonpSerializable {
	private final String alias;

	@Nullable
	private final Boolean moveOnCreation;

	// ---------------------------------------------------------------------------------------------

	private DestinationAlias(Builder builder) {

		this.alias = ApiTypeHelper.requireNonNull(builder.alias, this, "alias");
		this.moveOnCreation = builder.moveOnCreation;

	}

	public static DestinationAlias of(Function<Builder, ObjectBuilder<DestinationAlias>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the alias.
	 * <p>
	 * API name: {@code alias}
	 */
	public final String alias() {
		return this.alias;
	}

	/**
	 * Whether the destination index should be the only index in this alias. If
	 * <code>true</code>, all the other indices will be removed from this alias
	 * before adding the destination index to this alias. This does not delete the
	 * removed indices; it only removes them from the alias.
	 * <p>
	 * API name: {@code move_on_creation}
	 */
	@Nullable
	public final Boolean moveOnCreation() {
		return this.moveOnCreation;
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

		generator.writeKey("alias");
		generator.write(this.alias);

		if (this.moveOnCreation != null) {
			generator.writeKey("move_on_creation");
			generator.write(this.moveOnCreation);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DestinationAlias}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DestinationAlias> {
		private String alias;

		@Nullable
		private Boolean moveOnCreation;

		public Builder() {
		}
		private Builder(DestinationAlias instance) {
			this.alias = instance.alias;
			this.moveOnCreation = instance.moveOnCreation;

		}
		/**
		 * Required - The name of the alias.
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Whether the destination index should be the only index in this alias. If
		 * <code>true</code>, all the other indices will be removed from this alias
		 * before adding the destination index to this alias. This does not delete the
		 * removed indices; it only removes them from the alias.
		 * <p>
		 * API name: {@code move_on_creation}
		 */
		public final Builder moveOnCreation(@Nullable Boolean value) {
			this.moveOnCreation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DestinationAlias}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DestinationAlias build() {
			_checkSingleUse();

			return new DestinationAlias(this);
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
	 * Json deserializer for {@link DestinationAlias}
	 */
	public static final JsonpDeserializer<DestinationAlias> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DestinationAlias::setupDestinationAliasDeserializer);

	protected static void setupDestinationAliasDeserializer(ObjectDeserializer<DestinationAlias.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::moveOnCreation, JsonpDeserializer.booleanDeserializer(), "move_on_creation");

	}

}
