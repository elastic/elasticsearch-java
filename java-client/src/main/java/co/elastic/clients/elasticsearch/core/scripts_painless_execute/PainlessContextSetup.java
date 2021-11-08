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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.scripts_painless_execute;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.PainlessContextSetup
@JsonpDeserializable
public class PainlessContextSetup implements JsonpSerializable {
	private final JsonData document;

	private final String index;

	private final Query query;

	// ---------------------------------------------------------------------------------------------

	private PainlessContextSetup(Builder builder) {

		this.document = ModelTypeHelper.requireNonNull(builder.document, this, "document");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static PainlessContextSetup of(Function<Builder, ObjectBuilder<PainlessContextSetup>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code document}
	 */
	public final JsonData document() {
		return this.document;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
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

		generator.writeKey("document");
		this.document.serialize(generator, mapper);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PainlessContextSetup}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PainlessContextSetup> {
		private JsonData document;

		private String index;

		private Query query;

		/**
		 * Required - API name: {@code document}
		 */
		public final Builder document(JsonData value) {
			this.document = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Builds a {@link PainlessContextSetup}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PainlessContextSetup build() {
			_checkSingleUse();

			return new PainlessContextSetup(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PainlessContextSetup}
	 */
	public static final JsonpDeserializer<PainlessContextSetup> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PainlessContextSetup::setupPainlessContextSetupDeserializer, Builder::build);

	protected static void setupPainlessContextSetupDeserializer(
			DelegatingDeserializer<PainlessContextSetup.Builder> op) {

		op.add(Builder::document, JsonData._DESERIALIZER, "document");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

}
