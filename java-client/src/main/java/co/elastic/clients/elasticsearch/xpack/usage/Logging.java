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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.Logging

/**
 * Usage statistics about logging configuration reported by
 * <code>_xpack/usage</code>.
 * 
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Logging">API
 *      specification</a>
 */
@JsonpDeserializable
public class Logging implements JsonpSerializable {
	private final QueryLoggingConfig querylog;

	private final EsqlLoggingConfig esql;

	// ---------------------------------------------------------------------------------------------

	private Logging(Builder builder) {

		this.querylog = ApiTypeHelper.requireNonNull(builder.querylog, this, "querylog");
		this.esql = ApiTypeHelper.requireNonNull(builder.esql, this, "esql");

	}

	public static Logging of(Function<Builder, ObjectBuilder<Logging>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Search query log configuration.
	 * <p>
	 * API name: {@code querylog}
	 */
	public final QueryLoggingConfig querylog() {
		return this.querylog;
	}

	/**
	 * Required - ES|QL query log configuration.
	 * <p>
	 * API name: {@code esql}
	 */
	public final EsqlLoggingConfig esql() {
		return this.esql;
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

		generator.writeKey("querylog");
		this.querylog.serialize(generator, mapper);

		generator.writeKey("esql");
		this.esql.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Logging}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Logging> {
		private QueryLoggingConfig querylog;

		private EsqlLoggingConfig esql;

		public Builder() {
		}
		private Builder(Logging instance) {
			this.querylog = instance.querylog;
			this.esql = instance.esql;

		}
		/**
		 * Required - Search query log configuration.
		 * <p>
		 * API name: {@code querylog}
		 */
		public final Builder querylog(QueryLoggingConfig value) {
			this.querylog = value;
			return this;
		}

		/**
		 * Required - Search query log configuration.
		 * <p>
		 * API name: {@code querylog}
		 */
		public final Builder querylog(Function<QueryLoggingConfig.Builder, ObjectBuilder<QueryLoggingConfig>> fn) {
			return this.querylog(fn.apply(new QueryLoggingConfig.Builder()).build());
		}

		/**
		 * Required - ES|QL query log configuration.
		 * <p>
		 * API name: {@code esql}
		 */
		public final Builder esql(EsqlLoggingConfig value) {
			this.esql = value;
			return this;
		}

		/**
		 * Required - ES|QL query log configuration.
		 * <p>
		 * API name: {@code esql}
		 */
		public final Builder esql(Function<EsqlLoggingConfig.Builder, ObjectBuilder<EsqlLoggingConfig>> fn) {
			return this.esql(fn.apply(new EsqlLoggingConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Logging}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Logging build() {
			_checkSingleUse();

			return new Logging(this);
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
	 * Json deserializer for {@link Logging}
	 */
	public static final JsonpDeserializer<Logging> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Logging::setupLoggingDeserializer);

	protected static void setupLoggingDeserializer(ObjectDeserializer<Logging.Builder> op) {

		op.add(Builder::querylog, QueryLoggingConfig._DESERIALIZER, "querylog");
		op.add(Builder::esql, EsqlLoggingConfig._DESERIALIZER, "esql");

	}

}
