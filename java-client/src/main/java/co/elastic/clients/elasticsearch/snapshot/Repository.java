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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
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

// typedef: snapshot._types.Repository

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot._types.Repository">API
 *      specification</a>
 */
@JsonpDeserializable
public class Repository implements OpenTaggedUnion<Repository.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Repository} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#snapshot._types.Repository">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Azure("azure"),

		Gcs("gcs"),

		Url("url"),

		S3("s3"),

		Fs("fs"),

		Source("source"),

		/** A custom {@code Repository} defined by a plugin */
		_Custom(null)

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Repository(RepositoryVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._repositoryKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private Repository(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static Repository of(Function<Builder, ObjectBuilder<Repository>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code Repository}, given its kind and some
	 * JSON data
	 */
	public Repository(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
	}

	/**
	 * Is this variant instance of kind {@code azure}?
	 */
	public boolean isAzure() {
		return _kind == Kind.Azure;
	}

	/**
	 * Get the {@code azure} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code azure} kind.
	 */
	public AzureRepository azure() {
		return TaggedUnionUtils.get(this, Kind.Azure);
	}

	/**
	 * Is this variant instance of kind {@code gcs}?
	 */
	public boolean isGcs() {
		return _kind == Kind.Gcs;
	}

	/**
	 * Get the {@code gcs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gcs} kind.
	 */
	public GcsRepository gcs() {
		return TaggedUnionUtils.get(this, Kind.Gcs);
	}

	/**
	 * Is this variant instance of kind {@code url}?
	 */
	public boolean isUrl() {
		return _kind == Kind.Url;
	}

	/**
	 * Get the {@code url} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code url} kind.
	 */
	public ReadOnlyUrlRepository url() {
		return TaggedUnionUtils.get(this, Kind.Url);
	}

	/**
	 * Is this variant instance of kind {@code s3}?
	 */
	public boolean isS3() {
		return _kind == Kind.S3;
	}

	/**
	 * Get the {@code s3} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code s3} kind.
	 */
	public S3Repository s3() {
		return TaggedUnionUtils.get(this, Kind.S3);
	}

	/**
	 * Is this variant instance of kind {@code fs}?
	 */
	public boolean isFs() {
		return _kind == Kind.Fs;
	}

	/**
	 * Get the {@code fs} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fs} kind.
	 */
	public SharedFileSystemRepository fs() {
		return TaggedUnionUtils.get(this, Kind.Fs);
	}

	/**
	 * Is this variant instance of kind {@code source}?
	 */
	public boolean isSource() {
		return _kind == Kind.Source;
	}

	/**
	 * Get the {@code source} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code source} kind.
	 */
	public SourceOnlyRepository source() {
		return TaggedUnionUtils.get(this, Kind.Source);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code Repository} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Repository> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Repository> azure(AzureRepository v) {
			this._kind = Kind.Azure;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> azure(Function<AzureRepository.Builder, ObjectBuilder<AzureRepository>> fn) {
			return this.azure(fn.apply(new AzureRepository.Builder()).build());
		}

		public ObjectBuilder<Repository> gcs(GcsRepository v) {
			this._kind = Kind.Gcs;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> gcs(Function<GcsRepository.Builder, ObjectBuilder<GcsRepository>> fn) {
			return this.gcs(fn.apply(new GcsRepository.Builder()).build());
		}

		public ObjectBuilder<Repository> url(ReadOnlyUrlRepository v) {
			this._kind = Kind.Url;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> url(
				Function<ReadOnlyUrlRepository.Builder, ObjectBuilder<ReadOnlyUrlRepository>> fn) {
			return this.url(fn.apply(new ReadOnlyUrlRepository.Builder()).build());
		}

		public ObjectBuilder<Repository> s3(S3Repository v) {
			this._kind = Kind.S3;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> s3(Function<S3Repository.Builder, ObjectBuilder<S3Repository>> fn) {
			return this.s3(fn.apply(new S3Repository.Builder()).build());
		}

		public ObjectBuilder<Repository> fs(SharedFileSystemRepository v) {
			this._kind = Kind.Fs;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> fs(
				Function<SharedFileSystemRepository.Builder, ObjectBuilder<SharedFileSystemRepository>> fn) {
			return this.fs(fn.apply(new SharedFileSystemRepository.Builder()).build());
		}

		public ObjectBuilder<Repository> source(SourceOnlyRepository v) {
			this._kind = Kind.Source;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Repository> source(
				Function<SourceOnlyRepository.Builder, ObjectBuilder<SourceOnlyRepository>> fn) {
			return this.source(fn.apply(new SourceOnlyRepository.Builder()).build());
		}

		/**
		 * Define this {@code Repository} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code Repository}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<Repository> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public Repository build() {
			_checkSingleUse();
			return new Repository(this);
		}

	}

	protected static void setupRepositoryDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::azure, AzureRepository._DESERIALIZER, "azure");
		op.add(Builder::gcs, GcsRepository._DESERIALIZER, "gcs");
		op.add(Builder::url, ReadOnlyUrlRepository._DESERIALIZER, "url");
		op.add(Builder::s3, S3Repository._DESERIALIZER, "s3");
		op.add(Builder::fs, SharedFileSystemRepository._DESERIALIZER, "fs");
		op.add(Builder::source, SourceOnlyRepository._DESERIALIZER, "source");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<Repository> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Repository::setupRepositoryDeserializer, Builder::build);
}
