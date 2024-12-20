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

package co.elastic.clients.elasticsearch.ingest;

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

// typedef: ingest._types.Maxmind

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.Maxmind">API
 *      specification</a>
 */
@JsonpDeserializable
public class Maxmind implements DatabaseConfigurationFullVariant, DatabaseConfigurationVariant, JsonpSerializable {
	private final String accountId;

	// ---------------------------------------------------------------------------------------------

	private Maxmind(Builder builder) {

		this.accountId = ApiTypeHelper.requireNonNull(builder.accountId, this, "accountId");

	}

	public static Maxmind of(Function<Builder, ObjectBuilder<Maxmind>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DatabaseConfigurationFull variant kind.
	 */
	@Override
	public DatabaseConfigurationFull.Kind _databaseConfigurationFullKind() {
		return DatabaseConfigurationFull.Kind.Maxmind;
	}

	/**
	 * DatabaseConfiguration variant kind.
	 */
	@Override
	public DatabaseConfiguration.Kind _databaseConfigurationKind() {
		return DatabaseConfiguration.Kind.Maxmind;
	}

	/**
	 * Required - API name: {@code account_id}
	 */
	public final String accountId() {
		return this.accountId;
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

		generator.writeKey("account_id");
		generator.write(this.accountId);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Maxmind}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Maxmind> {
		private String accountId;

		/**
		 * Required - API name: {@code account_id}
		 */
		public final Builder accountId(String value) {
			this.accountId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Maxmind}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Maxmind build() {
			_checkSingleUse();

			return new Maxmind(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Maxmind}
	 */
	public static final JsonpDeserializer<Maxmind> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Maxmind::setupMaxmindDeserializer);

	protected static void setupMaxmindDeserializer(ObjectDeserializer<Maxmind.Builder> op) {

		op.add(Builder::accountId, JsonpDeserializer.stringDeserializer(), "account_id");

	}

}
