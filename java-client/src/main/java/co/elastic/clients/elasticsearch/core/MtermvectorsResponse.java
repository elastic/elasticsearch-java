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

import co.elastic.clients.elasticsearch.core.mtermvectors.TermVectorsResult;
import co.elastic.clients.json.DelegatingDeserializer;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Response
@JsonpDeserializable
public class MtermvectorsResponse implements JsonpSerializable {
	private final List<TermVectorsResult> docs;

	// ---------------------------------------------------------------------------------------------

	private MtermvectorsResponse(Builder builder) {

		this.docs = ModelTypeHelper.unmodifiableRequired(builder.docs, this, "docs");

	}

	public static MtermvectorsResponse of(Function<Builder, ObjectBuilder<MtermvectorsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final List<TermVectorsResult> docs() {
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
			for (TermVectorsResult item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MtermvectorsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MtermvectorsResponse> {
		private List<TermVectorsResult> docs;

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(List<TermVectorsResult> value) {
			this.docs = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(TermVectorsResult... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		@SafeVarargs
		public final Builder docs(Function<TermVectorsResult.Builder, ObjectBuilder<TermVectorsResult>>... fns) {
			this.docs = new ArrayList<>(fns.length);
			for (Function<TermVectorsResult.Builder, ObjectBuilder<TermVectorsResult>> fn : fns) {
				this.docs.add(fn.apply(new TermVectorsResult.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link MtermvectorsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MtermvectorsResponse build() {
			_checkSingleUse();

			return new MtermvectorsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MtermvectorsResponse}
	 */
	public static final JsonpDeserializer<MtermvectorsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MtermvectorsResponse::setupMtermvectorsResponseDeserializer, Builder::build);

	protected static void setupMtermvectorsResponseDeserializer(
			DelegatingDeserializer<MtermvectorsResponse.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(TermVectorsResult._DESERIALIZER), "docs");

	}

}
