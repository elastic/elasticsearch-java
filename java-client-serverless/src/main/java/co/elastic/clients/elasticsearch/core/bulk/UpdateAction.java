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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.bulk.UpdateAction

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.UpdateAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateAction<TDocument, TPartialDocument> implements JsonpSerializable {
	@Nullable
	private final Boolean detectNoop;

	@Nullable
	private final TPartialDocument doc;

	@Nullable
	private final Boolean docAsUpsert;

	@Nullable
	private final Script script;

	@Nullable
	private final Boolean scriptedUpsert;

	@Nullable
	private final SourceConfig source;

	@Nullable
	private final TDocument upsert;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	@Nullable
	private final JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private UpdateAction(Builder<TDocument, TPartialDocument> builder) {

		this.detectNoop = builder.detectNoop;
		this.doc = builder.doc;
		this.docAsUpsert = builder.docAsUpsert;
		this.script = builder.script;
		this.scriptedUpsert = builder.scriptedUpsert;
		this.source = builder.source;
		this.upsert = builder.upsert;
		this.tDocumentSerializer = builder.tDocumentSerializer;
		this.tPartialDocumentSerializer = builder.tPartialDocumentSerializer;

	}

	public static <TDocument, TPartialDocument> UpdateAction<TDocument, TPartialDocument> of(
			Function<Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateAction<TDocument, TPartialDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Set to false to disable setting 'result' in the response to 'noop' if no
	 * change to the document occurred.
	 * <p>
	 * API name: {@code detect_noop}
	 */
	@Nullable
	public final Boolean detectNoop() {
		return this.detectNoop;
	}

	/**
	 * A partial update to an existing document.
	 * <p>
	 * API name: {@code doc}
	 */
	@Nullable
	public final TPartialDocument doc() {
		return this.doc;
	}

	/**
	 * Set to true to use the contents of 'doc' as the value of 'upsert'
	 * <p>
	 * API name: {@code doc_as_upsert}
	 */
	@Nullable
	public final Boolean docAsUpsert() {
		return this.docAsUpsert;
	}

	/**
	 * Script to execute to update the document.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * Set to true to execute the script whether or not the document exists.
	 * <p>
	 * API name: {@code scripted_upsert}
	 */
	@Nullable
	public final Boolean scriptedUpsert() {
		return this.scriptedUpsert;
	}

	/**
	 * Set to false to disable source retrieval. You can also specify a
	 * comma-separated list of the fields you want to retrieve.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * If the document does not already exist, the contents of 'upsert' are inserted
	 * as a new document. If the document exists, the 'script' is executed.
	 * <p>
	 * API name: {@code upsert}
	 */
	@Nullable
	public final TDocument upsert() {
		return this.upsert;
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

		if (this.detectNoop != null) {
			generator.writeKey("detect_noop");
			generator.write(this.detectNoop);

		}
		if (this.doc != null) {
			generator.writeKey("doc");
			JsonpUtils.serialize(this.doc, generator, tPartialDocumentSerializer, mapper);

		}
		if (this.docAsUpsert != null) {
			generator.writeKey("doc_as_upsert");
			generator.write(this.docAsUpsert);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.scriptedUpsert != null) {
			generator.writeKey("scripted_upsert");
			generator.write(this.scriptedUpsert);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (this.upsert != null) {
			generator.writeKey("upsert");
			JsonpUtils.serialize(this.upsert, generator, tDocumentSerializer, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateAction}.
	 */

	public static class Builder<TDocument, TPartialDocument>
			extends
				WithJsonObjectBuilderBase<Builder<TDocument, TPartialDocument>>
			implements
				ObjectBuilder<UpdateAction<TDocument, TPartialDocument>> {
		@Nullable
		private Boolean detectNoop;

		@Nullable
		private TPartialDocument doc;

		@Nullable
		private Boolean docAsUpsert;

		@Nullable
		private Script script;

		@Nullable
		private Boolean scriptedUpsert;

		@Nullable
		private SourceConfig source;

		@Nullable
		private TDocument upsert;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		/**
		 * Set to false to disable setting 'result' in the response to 'noop' if no
		 * change to the document occurred.
		 * <p>
		 * API name: {@code detect_noop}
		 */
		public final Builder<TDocument, TPartialDocument> detectNoop(@Nullable Boolean value) {
			this.detectNoop = value;
			return this;
		}

		/**
		 * A partial update to an existing document.
		 * <p>
		 * API name: {@code doc}
		 */
		public final Builder<TDocument, TPartialDocument> doc(@Nullable TPartialDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * Set to true to use the contents of 'doc' as the value of 'upsert'
		 * <p>
		 * API name: {@code doc_as_upsert}
		 */
		public final Builder<TDocument, TPartialDocument> docAsUpsert(@Nullable Boolean value) {
			this.docAsUpsert = value;
			return this;
		}

		/**
		 * Script to execute to update the document.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder<TDocument, TPartialDocument> script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Script to execute to update the document.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder<TDocument, TPartialDocument> script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * Set to true to execute the script whether or not the document exists.
		 * <p>
		 * API name: {@code scripted_upsert}
		 */
		public final Builder<TDocument, TPartialDocument> scriptedUpsert(@Nullable Boolean value) {
			this.scriptedUpsert = value;
			return this;
		}

		/**
		 * Set to false to disable source retrieval. You can also specify a
		 * comma-separated list of the fields you want to retrieve.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * Set to false to disable source retrieval. You can also specify a
		 * comma-separated list of the fields you want to retrieve.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(
				Function<SourceConfig.Builder, ObjectBuilder<SourceConfig>> fn) {
			return this.source(fn.apply(new SourceConfig.Builder()).build());
		}

		/**
		 * If the document does not already exist, the contents of 'upsert' are inserted
		 * as a new document. If the document exists, the 'script' is executed.
		 * <p>
		 * API name: {@code upsert}
		 */
		public final Builder<TDocument, TPartialDocument> upsert(@Nullable TDocument value) {
			this.upsert = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tDocumentSerializer(
				@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Serializer for TPartialDocument. If not set, an attempt will be made to find
		 * a serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tPartialDocumentSerializer(
				@Nullable JsonpSerializer<TPartialDocument> value) {
			this.tPartialDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument, TPartialDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateAction<TDocument, TPartialDocument> build() {
			_checkSingleUse();

			return new UpdateAction<TDocument, TPartialDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for UpdateAction
	 */
	public static <TDocument, TPartialDocument> JsonpDeserializer<UpdateAction<TDocument, TPartialDocument>> createUpdateActionDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument, TPartialDocument>>) Builder::new,
				op -> UpdateAction.setupUpdateActionDeserializer(op, tDocumentDeserializer,
						tPartialDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link UpdateAction} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<UpdateAction<Object, Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createUpdateActionDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.bulk.TDocument"),
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.bulk.TPartialDocument")));

	protected static <TDocument, TPartialDocument> void setupUpdateActionDeserializer(
			ObjectDeserializer<UpdateAction.Builder<TDocument, TPartialDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {

		op.add(Builder::detectNoop, JsonpDeserializer.booleanDeserializer(), "detect_noop");
		op.add(Builder::doc, tPartialDocumentDeserializer, "doc");
		op.add(Builder::docAsUpsert, JsonpDeserializer.booleanDeserializer(), "doc_as_upsert");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::scriptedUpsert, JsonpDeserializer.booleanDeserializer(), "scripted_upsert");
		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::upsert, tDocumentDeserializer, "upsert");

	}

}
