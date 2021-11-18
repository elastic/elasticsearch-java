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

package co.elastic.clients.elasticsearch.core.msearch;

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
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.MultisearchResponseBase

public abstract class MultisearchResponseBase<TDocument> implements JsonpSerializable {
	private final long took;

	private final List<ResponseItem<TDocument>> responses;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected MultisearchResponseBase(AbstractBuilder<TDocument, ?> builder) {

		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.responses = ModelTypeHelper.unmodifiableRequired(builder.responses, this, "responses");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code responses}
	 */
	public final List<ResponseItem<TDocument>> responses() {
		return this.responses;
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

		generator.writeKey("took");
		generator.write(this.took);

		if (ModelTypeHelper.isDefined(this.responses)) {
			generator.writeKey("responses");
			generator.writeStartArray();
			for (ResponseItem<TDocument> item0 : this.responses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>>
			extends
				ObjectBuilderBase {
		private Long took;

		private List<ResponseItem<TDocument>> responses;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code took}
		 */
		public final BuilderT took(long value) {
			this.took = value;
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final BuilderT responses(List<ResponseItem<TDocument>> value) {
			this.responses = value;
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final BuilderT responses(ResponseItem<TDocument>... value) {
			this.responses = Arrays.asList(value);
			return self();
		}

		/**
		 * Required - API name: {@code responses}
		 */
		@SafeVarargs
		public final BuilderT responses(
				Function<ResponseItem.Builder<TDocument>, ObjectBuilder<ResponseItem<TDocument>>>... fns) {
			this.responses = new ArrayList<>(fns.length);
			for (Function<ResponseItem.Builder<TDocument>, ObjectBuilder<ResponseItem<TDocument>>> fn : fns) {
				this.responses.add(fn.apply(new ResponseItem.Builder<TDocument>()).build());
			}
			return self();
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupMultisearchResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(AbstractBuilder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(AbstractBuilder::responses,
				JsonpDeserializer.arrayDeserializer(ResponseItem.createResponseItemDeserializer(tDocumentDeserializer)),
				"responses");

	}

}
