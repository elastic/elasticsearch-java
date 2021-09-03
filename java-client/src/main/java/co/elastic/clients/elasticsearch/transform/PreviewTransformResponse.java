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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: transform.preview_transform.Response
public final class PreviewTransformResponse<TTransform> implements ToJsonp {
	private final IndexState generatedDestIndex;

	private final List<TTransform> preview;

	@Nullable
	private final JsonpSerializer<TTransform> tTransformSerializer;

	// ---------------------------------------------------------------------------------------------

	protected PreviewTransformResponse(Builder<TTransform> builder) {

		this.generatedDestIndex = Objects.requireNonNull(builder.generatedDestIndex, "generated_dest_index");
		this.preview = Objects.requireNonNull(builder.preview, "preview");
		this.tTransformSerializer = builder.tTransformSerializer;

	}

	/**
	 * API name: {@code generated_dest_index}
	 */
	public IndexState generatedDestIndex() {
		return this.generatedDestIndex;
	}

	/**
	 * API name: {@code preview}
	 */
	public List<TTransform> preview() {
		return this.preview;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("generated_dest_index");
		this.generatedDestIndex.toJsonp(generator, mapper);

		generator.writeKey("preview");
		generator.writeStartArray();
		for (TTransform item0 : this.preview) {
			JsonpUtils.serialize(item0, generator, tTransformSerializer, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewTransformResponse}.
	 */
	public static class Builder<TTransform> implements ObjectBuilder<PreviewTransformResponse<TTransform>> {
		private IndexState generatedDestIndex;

		private List<TTransform> preview;

		@Nullable
		private JsonpSerializer<TTransform> tTransformSerializer;

		/**
		 * API name: {@code generated_dest_index}
		 */
		public Builder<TTransform> generatedDestIndex(IndexState value) {
			this.generatedDestIndex = value;
			return this;
		}

		/**
		 * API name: {@code generated_dest_index}
		 */
		public Builder<TTransform> generatedDestIndex(Function<IndexState.Builder, ObjectBuilder<IndexState>> fn) {
			return this.generatedDestIndex(fn.apply(new IndexState.Builder()).build());
		}

		/**
		 * API name: {@code preview}
		 */
		public Builder<TTransform> preview(List<TTransform> value) {
			this.preview = value;
			return this;
		}

		/**
		 * API name: {@code preview}
		 */
		public Builder<TTransform> preview(TTransform... value) {
			this.preview = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #preview(List)}, creating the list if needed.
		 */
		public Builder<TTransform> addPreview(TTransform value) {
			if (this.preview == null) {
				this.preview = new ArrayList<>();
			}
			this.preview.add(value);
			return this;
		}

		/**
		 * Serializer for TTransform. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TTransform> tTransformSerializer(@Nullable JsonpSerializer<TTransform> value) {
			this.tTransformSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link PreviewTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewTransformResponse<TTransform> build() {

			return new PreviewTransformResponse<TTransform>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for PreviewTransformResponse
	 */
	public static <TTransform> JsonpDeserializer<PreviewTransformResponse<TTransform>> createPreviewTransformResponseDeserializer(
			JsonpDeserializer<TTransform> tTransformDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TTransform>>) Builder::new,
				op -> PreviewTransformResponse.setupPreviewTransformResponseDeserializer(op, tTransformDeserializer));
	};

	protected static <TTransform> void setupPreviewTransformResponseDeserializer(
			DelegatingDeserializer<PreviewTransformResponse.Builder<TTransform>> op,
			JsonpDeserializer<TTransform> tTransformDeserializer) {

		op.add(Builder::generatedDestIndex, IndexState.DESERIALIZER, "generated_dest_index");
		op.add(Builder::preview, JsonpDeserializer.arrayDeserializer(tTransformDeserializer), "preview");

	}

}
