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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.mget.Hit;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.mget.Response

public class MgetResponse<TDocument> implements JsonpSerializable {
	private final List<Hit<TDocument>> docs;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private MgetResponse(Builder<TDocument> builder) {

		this.docs = ModelTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> MgetResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MgetResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final List<Hit<TDocument>> docs() {
		return this.docs;
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

		if (ModelTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (Hit<TDocument> item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MgetResponse}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<MgetResponse<TDocument>> {
		private List<Hit<TDocument>> docs;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder<TDocument> docs(List<Hit<TDocument>> value) {
			this.docs = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder<TDocument> docs(Hit<TDocument>... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		@SafeVarargs
		public final Builder<TDocument> docs(Function<Hit.Builder<TDocument>, ObjectBuilder<Hit<TDocument>>>... fns) {
			this.docs = new ArrayList<>(fns.length);
			for (Function<Hit.Builder<TDocument>, ObjectBuilder<Hit<TDocument>>> fn : fns) {
				this.docs.add(fn.apply(new Hit.Builder<TDocument>()).build());
			}
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link MgetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetResponse<TDocument> build() {
			_checkSingleUse();

			return new MgetResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for MgetResponse
	 */
	public static <TDocument> JsonpDeserializer<MgetResponse<TDocument>> createMgetResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MgetResponse.setupMgetResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupMgetResponseDeserializer(
			DelegatingDeserializer<MgetResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(tDocumentDeserializer)),
				"docs");

	}

}
