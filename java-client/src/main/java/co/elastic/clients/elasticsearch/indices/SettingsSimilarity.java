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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SettingsSimilarity

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarity">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarity implements JsonpSerializable {
	@Nullable
	private final SettingsSimilarityBm25 bm25;

	@Nullable
	private final SettingsSimilarityDfi dfi;

	@Nullable
	private final SettingsSimilarityDfr dfr;

	@Nullable
	private final SettingsSimilarityIb ib;

	@Nullable
	private final SettingsSimilarityLmd lmd;

	@Nullable
	private final SettingsSimilarityLmj lmj;

	@Nullable
	private final SettingsSimilarityScriptedTfidf scriptedTfidf;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarity(Builder builder) {

		this.bm25 = builder.bm25;
		this.dfi = builder.dfi;
		this.dfr = builder.dfr;
		this.ib = builder.ib;
		this.lmd = builder.lmd;
		this.lmj = builder.lmj;
		this.scriptedTfidf = builder.scriptedTfidf;

	}

	public static SettingsSimilarity of(Function<Builder, ObjectBuilder<SettingsSimilarity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code bm25}
	 */
	@Nullable
	public final SettingsSimilarityBm25 bm25() {
		return this.bm25;
	}

	/**
	 * API name: {@code dfi}
	 */
	@Nullable
	public final SettingsSimilarityDfi dfi() {
		return this.dfi;
	}

	/**
	 * API name: {@code dfr}
	 */
	@Nullable
	public final SettingsSimilarityDfr dfr() {
		return this.dfr;
	}

	/**
	 * API name: {@code ib}
	 */
	@Nullable
	public final SettingsSimilarityIb ib() {
		return this.ib;
	}

	/**
	 * API name: {@code lmd}
	 */
	@Nullable
	public final SettingsSimilarityLmd lmd() {
		return this.lmd;
	}

	/**
	 * API name: {@code lmj}
	 */
	@Nullable
	public final SettingsSimilarityLmj lmj() {
		return this.lmj;
	}

	/**
	 * API name: {@code scripted_tfidf}
	 */
	@Nullable
	public final SettingsSimilarityScriptedTfidf scriptedTfidf() {
		return this.scriptedTfidf;
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

		if (this.bm25 != null) {
			generator.writeKey("bm25");
			this.bm25.serialize(generator, mapper);

		}
		if (this.dfi != null) {
			generator.writeKey("dfi");
			this.dfi.serialize(generator, mapper);

		}
		if (this.dfr != null) {
			generator.writeKey("dfr");
			this.dfr.serialize(generator, mapper);

		}
		if (this.ib != null) {
			generator.writeKey("ib");
			this.ib.serialize(generator, mapper);

		}
		if (this.lmd != null) {
			generator.writeKey("lmd");
			this.lmd.serialize(generator, mapper);

		}
		if (this.lmj != null) {
			generator.writeKey("lmj");
			this.lmj.serialize(generator, mapper);

		}
		if (this.scriptedTfidf != null) {
			generator.writeKey("scripted_tfidf");
			this.scriptedTfidf.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarity}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarity> {
		@Nullable
		private SettingsSimilarityBm25 bm25;

		@Nullable
		private SettingsSimilarityDfi dfi;

		@Nullable
		private SettingsSimilarityDfr dfr;

		@Nullable
		private SettingsSimilarityIb ib;

		@Nullable
		private SettingsSimilarityLmd lmd;

		@Nullable
		private SettingsSimilarityLmj lmj;

		@Nullable
		private SettingsSimilarityScriptedTfidf scriptedTfidf;

		/**
		 * API name: {@code bm25}
		 */
		public final Builder bm25(@Nullable SettingsSimilarityBm25 value) {
			this.bm25 = value;
			return this;
		}

		/**
		 * API name: {@code bm25}
		 */
		public final Builder bm25(Function<SettingsSimilarityBm25.Builder, ObjectBuilder<SettingsSimilarityBm25>> fn) {
			return this.bm25(fn.apply(new SettingsSimilarityBm25.Builder()).build());
		}

		/**
		 * API name: {@code dfi}
		 */
		public final Builder dfi(@Nullable SettingsSimilarityDfi value) {
			this.dfi = value;
			return this;
		}

		/**
		 * API name: {@code dfi}
		 */
		public final Builder dfi(Function<SettingsSimilarityDfi.Builder, ObjectBuilder<SettingsSimilarityDfi>> fn) {
			return this.dfi(fn.apply(new SettingsSimilarityDfi.Builder()).build());
		}

		/**
		 * API name: {@code dfr}
		 */
		public final Builder dfr(@Nullable SettingsSimilarityDfr value) {
			this.dfr = value;
			return this;
		}

		/**
		 * API name: {@code dfr}
		 */
		public final Builder dfr(Function<SettingsSimilarityDfr.Builder, ObjectBuilder<SettingsSimilarityDfr>> fn) {
			return this.dfr(fn.apply(new SettingsSimilarityDfr.Builder()).build());
		}

		/**
		 * API name: {@code ib}
		 */
		public final Builder ib(@Nullable SettingsSimilarityIb value) {
			this.ib = value;
			return this;
		}

		/**
		 * API name: {@code ib}
		 */
		public final Builder ib(Function<SettingsSimilarityIb.Builder, ObjectBuilder<SettingsSimilarityIb>> fn) {
			return this.ib(fn.apply(new SettingsSimilarityIb.Builder()).build());
		}

		/**
		 * API name: {@code lmd}
		 */
		public final Builder lmd(@Nullable SettingsSimilarityLmd value) {
			this.lmd = value;
			return this;
		}

		/**
		 * API name: {@code lmd}
		 */
		public final Builder lmd(Function<SettingsSimilarityLmd.Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
			return this.lmd(fn.apply(new SettingsSimilarityLmd.Builder()).build());
		}

		/**
		 * API name: {@code lmj}
		 */
		public final Builder lmj(@Nullable SettingsSimilarityLmj value) {
			this.lmj = value;
			return this;
		}

		/**
		 * API name: {@code lmj}
		 */
		public final Builder lmj(Function<SettingsSimilarityLmj.Builder, ObjectBuilder<SettingsSimilarityLmj>> fn) {
			return this.lmj(fn.apply(new SettingsSimilarityLmj.Builder()).build());
		}

		/**
		 * API name: {@code scripted_tfidf}
		 */
		public final Builder scriptedTfidf(@Nullable SettingsSimilarityScriptedTfidf value) {
			this.scriptedTfidf = value;
			return this;
		}

		/**
		 * API name: {@code scripted_tfidf}
		 */
		public final Builder scriptedTfidf(
				Function<SettingsSimilarityScriptedTfidf.Builder, ObjectBuilder<SettingsSimilarityScriptedTfidf>> fn) {
			return this.scriptedTfidf(fn.apply(new SettingsSimilarityScriptedTfidf.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarity build() {
			_checkSingleUse();

			return new SettingsSimilarity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarity}
	 */
	public static final JsonpDeserializer<SettingsSimilarity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarity::setupSettingsSimilarityDeserializer);

	protected static void setupSettingsSimilarityDeserializer(ObjectDeserializer<SettingsSimilarity.Builder> op) {

		op.add(Builder::bm25, SettingsSimilarityBm25._DESERIALIZER, "bm25");
		op.add(Builder::dfi, SettingsSimilarityDfi._DESERIALIZER, "dfi");
		op.add(Builder::dfr, SettingsSimilarityDfr._DESERIALIZER, "dfr");
		op.add(Builder::ib, SettingsSimilarityIb._DESERIALIZER, "ib");
		op.add(Builder::lmd, SettingsSimilarityLmd._DESERIALIZER, "lmd");
		op.add(Builder::lmj, SettingsSimilarityLmj._DESERIALIZER, "lmj");
		op.add(Builder::scriptedTfidf, SettingsSimilarityScriptedTfidf._DESERIALIZER, "scripted_tfidf");

	}

}
